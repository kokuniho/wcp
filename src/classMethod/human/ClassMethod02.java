package classMethod.human;

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yamada = new Human02();
		System.out.println("名前は" + yamada.name + "歳は" + yamada.age);
		
		Human02 sato = new Human02("佐藤", 25);
		System.out.println("名前は" + sato.name + "歳は" + sato.age);
	}
}


