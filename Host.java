class Host {
    
    String HostName;

    // Constructor
    // Same name as class
    Host(String str) {
        this.HostName = str;
    }

    // Constructor
    Host() {
    }

    // Method
    public void SetHostName(String hn) {
        this.HostName = hn;
    }

    // Method
    public String GetHostName() {
        return this.HostName;
    }

}
