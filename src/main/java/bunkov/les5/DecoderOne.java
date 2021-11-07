package bunkov.les5;

public class DecoderOne extends Decoder{
    @Override
    public boolean decode(String s) {
        //if s is decoded by this decoder, just skip it and return decodeNext
        return decodeNext(s);
    }
}
