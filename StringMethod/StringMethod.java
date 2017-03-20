public class StringMethod{
	public static void main(String[] args){
		String name1 = "Smith";
		name1 = name1.concat(" Brown");
		System.out.println("============= String =========");
		System.out.println("name1 = \"" + name1 + "\"");

		StringBuffer name2 = new StringBuffer("Smith");
		name2.append(" Brown");
		System.out.println("=========== StringBuffer ===========");
		System.out.println("name2 = \""+ name2 +"\"");

		System.out.println("=========== StringMethod ============");
		System.out.println("name1 = \"" + name1+ "\"");
		System.out.println("name1.replace(\"h\",\"e\")= "+
					name1.replace("h","e"));

		System.out.println("=======================================");
		System.out.println("============ StringBuffer Method =======");
		System.out.println("name2 = \""+ name2 + "\"");
		System.out.println("name2.insert(5,\"y\") = " +
					name2.insert(5,"y"));
		System.out.println("========================================");
		System.out.println("============ StringBuilder Method =======");
		StringBuilder name3 = new StringBuilder(name2);
		System.out.println("name3 = \""+ name3 + "\"");
		System.out.println("name3.delete(4,5)= " + name3.delete(4,5));
		System.out.println("=========================================");
	}
}