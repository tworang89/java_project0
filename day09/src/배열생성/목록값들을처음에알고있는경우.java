package 배열생성;

public class 목록값들을처음에알고있는경우 {

	public static void main(String[] args) {
		// 배열을 만들때는 처음부터 값들을 알고 있는 경우/모르는 경우
		String[] names = { "홍길동", "송길동", "정길동", "박길동", "장길동" };

		for (int i = 0; i < names.length; i++) {

			System.out.println(names[i]);

		}

		int[] ages = { 100, 88, 55, 10, 4 };
		for (int i = 0; i < ages.length; i++) {

			System.out.println(ages[i]);

		}

		for (int x : ages) {

		}

		double[] eyes = { 2.0, 1.5, 1.2, 0.8, 1.0 };
		for (int i = 0; i < eyes.length; i++) {

			System.out.println(eyes[i]);

		}

		for (double y : eyes) {

		}

		char[] gender = { '남', '여', '남', '여' };

		for (int i = 0; i < gender.length; i++) {

			System.out.println(gender[1]);

		}

		for (char c : gender) {

		}

		boolean[] food = { true, false, true, false };

		for (int i = 0; i < food.length; i++) {

			System.out.println(food[i]);

		}
		for (boolean b : food) {

		}

	}

}
