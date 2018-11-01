package h_javaLang;

class WrapperEx1{
	public static void main(String[] args){
		Integer i  = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println("i==i2 ? "+(i==i2));					// false
		System.out.println("i.equals(i2) ? "+i.equals(i2));		// true
		System.out.println("i.compareTo(i2)="+i.compareTo(i2));	// 0
		System.out.println("i.toString()="+i.toString());		// 100

		System.out.println("MAX_VALUE="+Integer.MAX_VALUE);		// 2147483647
		System.out.println("MIN_VALUE="+Integer.MIN_VALUE);		// -2147483648
		System.out.println("SIZE=" +Integer.SIZE+" bits");		// 32bits
		System.out.println("BYTES="+Integer.BYTES+" bytes");	// 4bytes
		System.out.println("TYPE=" +Integer.TYPE);				// int
	}
}