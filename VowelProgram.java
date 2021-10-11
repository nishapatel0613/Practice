public class VowelProgram {

    public static void main(String[] args) {

        int vCount = 0;
        int cCount = 0;
        String st = "Today is a nice day";
        st = st.toLowerCase();

        for(int i = 0; i < st.length(); i++){
            if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u'){
                vCount++;
            }else if(st.charAt(i) >= 'a' && st.charAt(i) <= 'z'){
                cCount++;

            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);

    }
}