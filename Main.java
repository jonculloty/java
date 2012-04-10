class Main {

    public static void main (String args[]) {

        System.out.println("Starting Here");

        Host host = new Host();
        host.SetHostName("xen");

        Host host2 = new Host("virt");

        String str = host.GetHostName();

        System.out.println(str);
        System.out.println( host2.GetHostName() );

    }

}
