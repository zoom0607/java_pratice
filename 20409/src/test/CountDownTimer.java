package test;

import javax.swing.JLabel;

public class CountDownTimer implements Runnable{
	JLabel timerLabel;
	
	//쓰레드에서 숫자라벨에 접근하기 위하여 생성자 참조
	public CountDownTimer(JLabel timerLabel) {
		this.timerLabel=timerLabel;
	}

	@Override
	public void run() {
		int  n = 0;
		while(true) {
			String strNumber = timerLabel.getText().trim();
			if(strNumber.equals("0"))
				break; //0이면 쓰레드 중지
			
			n=Integer.parseInt(strNumber)-1;
			timerLabel.setText(Integer.toString(n));
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				return; //예외가 발생하면 run메소드 종료
			}
			
			}
		
	}
	
	
}
