import javax.swing.*;

class Thread_mihon extends JFrame implements Runnable{
	Thread th;	// ①マルチスレッドの機能を作成
	int no = 0;
	JLabel a;

	Thread_mihon(){	// 初期設定　＝　コンストラクタ
		setSize(400,400);
		setBackground(Color.pink);

		a = new JLabel(no + "", JLabel.CENTER);

		Container c;	// コンテナーを敷く（型紙）
		c = this.getContentPane();

		c.add(a);

		th = new Thread(this);	//②マルチスレッドをインスタンス
		th.start();	// ④別処理（スレッドをスタート	
	}

	public void run(){	// ④ランする
		setFont(BOLD,24);
		new setFont();

		while(true){
			no++;
			a.setFont(no+"");

			try{
			th.sleep(1000);	//スレッドを休ませる
			}catch(InterruptedException er){
				System.out.println("error");
			}
		}
	}

	public static void main(String args[]){
		new Thread_mihon().setVisible(true);
	}
}