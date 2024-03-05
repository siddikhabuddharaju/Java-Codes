class fungus
{
    public
        void displaydanger()
        {
            System.out.print("Iam not supposed to take in your diet , formed from dead and decaying matter. \n");
        }
        void okaytoeat()
        {
            System.out.print("Some of the nutrious food is formed from me. \n");
        }
}
class mushroom extends fungus
{
    public
        void goodfood()
        {
            System.out.print("Sometimes i can be included in your diet and also can consists of huge protiens. \n");
        }
}
public class simpleinheritancee
{
    public static void main(String[] args) 
    {
        mushroom bacteria = new mushroom();
        bacteria.displaydanger();
        bacteria.okaytoeat();
        bacteria.goodfood();
    }
}
