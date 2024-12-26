public class capQ1 {
        public static void main(String[] args) {
        StringBuilder input=new StringBuilder("aabbbbeeeeffggg");
        StringBuilder output=new StringBuilder("");
        int count=1;
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)==input.charAt(i-1)){
                count++;
            }else{
                output.append(input.charAt(i-1)).append(count);
                count=1;
            }
        }
        output.append(input.charAt(input.length()-1)).append(count);
        System.out.println(output);
    }
}
