import javax.swing.*;

class Thread_mihon extends JFrame implements Runnable{
	Thread th;	// �@�}���`�X���b�h�̋@�\���쐬
	int no = 0;
	JLabel a;

	Thread_mihon(){	// �����ݒ�@���@�R���X�g���N�^
		setSize(400,400);
		setBackground(Color.pink);

		a = new JLabel(no + "", JLabel.CENTER);

		Container c;	// �R���e�i�[��~���i�^���j
		c = this.getContentPane();

		c.add(a);

		th = new Thread(this);	//�A�}���`�X���b�h���C���X�^���X
		th.start();	// �C�ʏ����i�X���b�h���X�^�[�g	
	}

	public void run(){	// �C��������
		setFont(BOLD,24);
		new setFont();

		while(true){
			no++;
			a.setFont(no+"");

			try{
			th.sleep(1000);	//�X���b�h���x�܂���
			}catch(InterruptedException er){
				System.out.println("error");
			}
		}
	}

	public static void main(String args[]){
		new Thread_mihon().setVisible(true);
	}
}