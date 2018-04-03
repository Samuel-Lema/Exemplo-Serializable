package exemploserializable;

import java.io.*;

public class MeuObjectOutputStream extends ObjectOutputStream {
    
    public MeuObjectOutputStream() throws IOException{
        
    }
    
    public MeuObjectOutputStream(OutputStream ou)throws IOException{
        
        super(ou);
    }
    
    @Override protected void writeStreamHeader() throws IOException {
        
    }
}
