package bunkov.les5;

public class Main {
    public static void main(String[] args) {
        Decoder decoder1 = new DecoderOne();
        Decoder decoder3 = new DecoderTwo();
        Decoder decoder2 = new DecoderThree();
        decoder1.link(decoder2).link(decoder3);
        decoder1.decode("*YRCBUYASDFGCB&I^!@#");

    }
}
