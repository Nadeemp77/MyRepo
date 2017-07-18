public class DataType {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        ScanClass scan = new ScanClass(System.in);
        int j = Integer.parseInt(scan.nextLine());
        double k = Double.parseDouble(scan.nextLine());
        String l = scan.nextLine();

        System.out.println(i + j);
        System.out.println(d + k);
        System.out.println(s+l);
        scan.close();
    }
}