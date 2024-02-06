package String_Problems;

/**
 * A version number is a string that is used to identify the unique state of a software product.
 * A version number looks like a.b.c.d, where a, b, etc are numbers, so the version number is a string
 * in which numbers are separated by dots. These numbers generally represent the hierarchy from major to minor(a is major and d is minor).
 * In this problem, we are given two version numbers. We need to compare them and conclude which one is the latest version number (that is, which version number is greater).
 *
 * Example:
 * Input:
 * V1 = “1.0.31”
 * V2 = “1.0.27”
 * Output:  v1 is latest
 * Because V2 < V1
 * Input:
 * V1 = “1.0.10”
 * V2 = “1.0.27”
 * Output:  v2 is latest
 * Because V1 < v2
 */
public class Version {
    public static void main(String[] args) {
        System.out.println(versionCompare("1.0.10", "1.0.27" ));
        System.out.println(versionCompare("1.0.31", "1.0.27" ));
    }
    public static String versionCompare(String v1 , String v2){
       String version1 = v1.replaceAll("\\.","");
       String version2 = v2.replaceAll("\\.","");

       if(Integer.parseInt(version1)>Integer.parseInt(version2)){
           return v1;
       }
       return v2;



    }

}
