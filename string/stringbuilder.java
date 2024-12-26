public class stringbuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("skand");
        sb.append("mishra");
        // System.out.println(sb);
        // System.out.println(sb.charAt(5));
        // for(int i=0;i<sb.length();i++){
        //     System.out.println(sb.charAt(i));
        // }
        sb.insert(5," ");
        // System.out.println(sb.charAt(5));
        // for(int i=0;i<sb.length();i++){
        //     System.out.print(sb.charAt(i));
        // }
        for(int i=0;i<sb.length()/2;i++){
        char frontchar=sb.charAt(i);
        char endchar=sb.charAt(sb.length()-1-i);
        sb.setCharAt(i, endchar);
        sb.setCharAt(sb.length()-1-i, frontchar);
        }
        System.out.println(sb);
    }
}
