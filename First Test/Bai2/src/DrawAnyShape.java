public class DrawAnyShape {
    private int height;

    public DrawAnyShape() {
    }

    public DrawAnyShape(int height) {
        this.height = height;
    }

    public void drawShape(){
        char symbol = '*';
        for(int i = 1; i <= height; i++)
        {
            for(int j = height; j > i; j--)
            {
                System.out.print(" ");
            }
            System.out.print(symbol);
            for(int j = 1; j < (i-1)*2; j++)
            {
                System.out.print(" ");
            }
            if(i == 1)
            {
                System.out.print("\n");
            }
            else
            {
                System.out.print(symbol+"\n");
            }
        }
        for(int i = height-1; i>=1; i--)
        {
            for(int j = height; j>i; j--)
            {
                System.out.print(" ");
            }
            System.out.print(symbol);
            for(int j = 1; j < (i-1)*2; j++)
            {
                System.out.print(" ");
            }
            if(i == 1)
            {
                System.out.print("\n");
            }
            else
            {
                System.out.print(symbol+"\n");
            }
        }

    }
}
