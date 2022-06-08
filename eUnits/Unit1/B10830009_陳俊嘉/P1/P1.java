package P1;
public class P1 {
	static void showAnimal(Animal A) {
		A.show();
	}

	static void run_API(Animal a) {
		((Irun) a).run_go();
	}

	static void jump_API(Animal a) {
		((Ijump) a).jump_go();
	}

	static void fly_API(Animal a) {
		((Ifly) a).fly_go();
	}

	public static void main(String[] args) {
		// foot 幾隻腳;
		// high 高 cm;
		// weight 體重 kg;
		// Animal(int foot, int height, int weight)

		Animal chicken_1 = new Chicken(2, 30, 38);
		Animal rabbit_1 = new Rabbit(4, 25, 35);
		Animal cow_1 = new Cow(4, 160, 1000);
		Animal swallow_1 = new Swallow(2, 15, 20);

		System.out.println("餵食前");
		showAnimal(chicken_1);
		showAnimal(rabbit_1);
		showAnimal(cow_1);
		showAnimal(swallow_1);

		chicken_1.eat();
		rabbit_1.eat();
		cow_1.eat();
		swallow_1.eat();

		System.out.println("餵食後");
		showAnimal(chicken_1);
		showAnimal(rabbit_1);
		showAnimal(cow_1);
		showAnimal(swallow_1);

		System.out.println("動起來");
		jump_API(rabbit_1);
		run_API(cow_1);
		fly_API(swallow_1);
		run_API(chicken_1);
		jump_API(chicken_1);

		try {
			fly_API(cow_1);
		} catch (Exception e) {
			System.out.println("牛不會飛");
		}
	}
}