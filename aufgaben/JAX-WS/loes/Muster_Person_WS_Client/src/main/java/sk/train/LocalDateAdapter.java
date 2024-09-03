package sk.train;

import java.time.LocalDate;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

	@Override
	public LocalDate unmarshal(String v) throws Exception {
		
		return LocalDate.parse(v);
	}

	@Override
	public String marshal(LocalDate v) throws Exception {
		 
		return v.toString();
	}
	
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		String s = d.toString();
		System.out.println(s);
		d = LocalDate.parse(s);
		System.out.println(d);
	}

}
