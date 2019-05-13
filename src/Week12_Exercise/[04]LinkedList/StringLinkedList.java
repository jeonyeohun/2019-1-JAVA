public class StringLinkedList{
  private ListNode head;
  public StringLinkedList(){
    head = null;
  }
  public void showList(){
    ListNode position = head;
    while(position != null){
      System.out.println(position.getData());
      position = position.getLink();
    }
  }
  public int length(){
    int cnt = 0;
    ListNode position = head;
    while(position != null){
      cnt++;
      position = position.getLink();
    }
    return cnt;
  }
  public void addANodeToStart(String addData){
    head = new ListNode (addData, head);
  }

  public void deleteHeadNode(){
    if(head != null)
      head = head.getLink();
    else{
      System.out.println("Deleting from an empty list");
      System.exit(0);
    }
  }
  public boolean onList(String target){
    return find(target) != null;
  }

  private ListNode find(String target){
    boolean found = false;
    ListNode position = head;
    while((position!=null) && !found){
      String dataAtPosition = position.getData();
      if (dataAtPosition.equals(target)) found = true;
      else position = position.getLink();
    }
    return position;
  }

}
