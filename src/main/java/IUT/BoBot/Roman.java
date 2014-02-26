package IUT.BoBot;

public class Roman {
public static int decode(final String s) {
	    int res = 0, chartrad, oldchartrad = 0;
	         for (int a = 0; a < s.length(); a++) {
	        	chartrad = retour(s.toCharArray()[a]);
	        	if (chartrad > oldchartrad) {
		        	res += (chartrad - 2 * oldchartrad);
	        	}
	        	else {
	        		res += chartrad;
	        	}
	        	oldchartrad = chartrad;
	         }
	         return res;
	}
	public static int retour(final char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'C':
			return 100;
		case 'L':
			return 50;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
		break;
		}
		return 0;
	}
}