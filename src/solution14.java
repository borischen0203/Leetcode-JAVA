public class solution14 {

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		String pre = strs[0];
		for (int i = 1; i < strs.length; i++) {
			// System.out.println(strs[i].indexOf(pre));
			while (strs[i].indexOf(pre) != 0) {
				pre = pre.substring(0, pre.length() - 1);//
			}
		}
		return pre;
	}
	// public String longestCommonPrefix(String[] strs) {
	// String predict = strs[0];
	// if (strs.length == 0) {
	// return "";
	// }
	// for (int i = 1; i < strs.length; i++) {
	// if (strs[i].indexOf(predict) != 0) {
	// predict = predict.substring(0, predict.length() - 1);
	// }
	// }
	// return predict;
	// }

	public static void main(String[] args) {
		solution14 a = new solution14();
		// String[] strs = new String[] { "12345", "1234", "12" };
		String[] strs = { "flower", "flow", "flight" };
		System.out.println(a.longestCommonPrefix(strs));
		// String stri = "1234";
		// String pre = "1234";
		// System.out.println(stri.indexOf(pre));
	}
}