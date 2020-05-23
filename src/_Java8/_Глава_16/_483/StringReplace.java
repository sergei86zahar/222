package _Java8._Глава_16._483;

// Substring replacement.
class StringReplace {
    public static void main(String args[]) {
        String org = "This is a test. This is, too.";
        String is = "is";
        String was = "was";
        String result = "";
        int i;

        do { // replace all matching substrings
            System.out.println(org);
            i = org.indexOf(is);
            System.out.println(i);
            if(i != -1) {
                result = org.substring(0, i);
                result = result + was;
                result = result + org.substring(i + is.length());
                org = result;
            }
        } while(i != -1);

    }
}
