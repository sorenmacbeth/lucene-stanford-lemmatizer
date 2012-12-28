package nl.rug.eco.lucene;

import org.apache.lucene.util.AttributeImpl;

public final class PartOfSpeechAttributeImpl extends AttributeImpl implements PartOfSpeechAttribute {
      
    private String _pos = "";

    public void setPartOfSpeech(String pos) {
        _pos = pos;
    }

    public String getPartOfSpeech() {
        return _pos;
    }

    @Override
    public void clear() {
        _pos = "";
    }

    @Override
    public void copyTo(AttributeImpl target) {
        ((PartOfSpeechAttribute) target).setPartOfSpeech(_pos);
    }
}
