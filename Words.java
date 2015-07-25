public class Words{
    
    public static void main(String args[]){
        String[] wordList1 = {"Bring", "Fire", "Fight", "Felp"};
        String[] wordList2 = {"King", "Jing", "Ping", "Fought"};
        String[] wordList3 = {"What", "Fuck", "Duck", "Nuck"};
        
        int oneLength = wordList1.length;
        int twoLength = wordList2.length;
        int threeLength = wordList3.length;
        
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        
        String pharse = wordList1[rand1] + wordList2[rand2] + wordList3[rand3];
        //System.out.println("Random number of word list 1 is "+rand1);
        System.out.println("Word list 1 length is "+oneLength);
        System.out.println("We need is "+pharse);
    }
}
