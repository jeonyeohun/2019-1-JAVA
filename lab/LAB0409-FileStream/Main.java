class File {
  public String content;
}

class Stream {
  private String buffer;
  
  protected void setBuffer(String buffer){
    this.buffer = buffer;
  }
  protected String getBuffer(){
    return this.buffer;
  }
  protected void send(Object o){
    File file = (File)o;
    file.content = this.getBuffer();
  }
  protected void recv(Object o){
    File file = (File)o;
    buffer = file.content;
  }
}

class FileReader extends Stream {
  private File file;
  
  public FileReader(File f) {
    file = f;
  }
  
  public String read() {
    recv(file);
    return getBuffer();
  }
}

class FileWriter extends Stream {
  private File file;
  
  public FileWriter(File f) {
    file = f;
  }
  
  public void write(String s) {
    setBuffer(s);
    send(file);
  }
}

class Main {
  public static void main(String[] args) {
    File file = new File();
		FileWriter writer = new FileWriter(file);
		FileReader reader = new FileReader(file);
		
		writer.write("Hello");
		String content = reader.read();
		
		System.out.println("File by direct : " + file.content);
		System.out.println("File by reader : " + content);
  }
}