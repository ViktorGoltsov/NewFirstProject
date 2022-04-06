package HW;

public class HW6_Block {
    int width;
    int length;
    int height;

    HW6_Block(int [] arr){
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume () {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return (2 * (width * length + height * length + width * height));
    }

    public static void main(String[] args) {
    int [] arr = {2, 4, 6};
    HW6_Block b = new HW6_Block(arr);
        System.out.println(b.getHeight());
        System.out.println(b.getLength());
        System.out.println(b.getWidth());
        System.out.println(b.getVolume());
        System.out.println(b.getSurfaceArea());
    }
}


