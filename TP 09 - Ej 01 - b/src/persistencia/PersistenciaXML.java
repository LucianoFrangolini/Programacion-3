package persistencia;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PersistenciaXML implements IPersistencia {
	
	private FileOutputStream fileOutput;
	private FileInputStream fileInput;
	private XMLEncoder xmlEncoder;
	private XMLDecoder xmlDecoder;

	@Override
	public void abrirInput(String nombre) throws IOException {
		fileInput = new FileInputStream(nombre);
		xmlDecoder = new XMLDecoder(fileInput);
	}

	@Override
	public void abrirOutput(String nombre) throws IOException {
		fileOutput = new FileOutputStream(nombre);
		xmlEncoder = new XMLEncoder(fileOutput);
	}

	@Override
	public void cerrarInput() throws IOException {
		if (xmlDecoder!=null)
			this.xmlDecoder.close();
			
	}

	@Override
	public void cerrarOutput() throws IOException {
		if (xmlEncoder!=null)
			this.xmlEncoder.close();
	}

	@Override
	public void escribir(Object objeto) throws IOException {
		if (xmlEncoder!=null)
			xmlEncoder.writeObject(objeto);
	}

	@Override
	public Object leer() throws IOException, ClassNotFoundException {
		
		Object objeto = null;
		if (xmlDecoder!=null)
			objeto = xmlDecoder.readObject();
		return objeto;
	}

}
