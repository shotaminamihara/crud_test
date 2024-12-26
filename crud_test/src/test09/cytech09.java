package test09;

public class cytech09 {

	public static void main(String[] args) {
		String[] curriculum = {"国語","数学","理科","社会"};
		int[][] scores = {
				{10,20,30,40},
				{50,60,707,80},
				{40,30,20,10},
				{80,70,60,50},
				{1,2,3,4,5}
		};
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("学生" + (i + 1) + "の点数");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.println(curriculum[j] + ":" + scores[i][j] + "点");
			}
			System.out.println();
		}
		
	}

}
