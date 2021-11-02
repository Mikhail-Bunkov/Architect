package bunkov.les5;

public abstract class Decoder {
    private Decoder nextDecoder;

    public Decoder link(Decoder decoder){
        this.nextDecoder = decoder;
        return nextDecoder;
    }

    public abstract boolean decode(String s);
    protected boolean decodeNext(String s){
        return nextDecoder != null ? true :nextDecoder.decode(s);
    }
}
