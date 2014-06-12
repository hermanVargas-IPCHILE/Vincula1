package example.vinculo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class vinculo2java extends Activity {
//hola este es otro comentario
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vinculo2);
	}
	public void salir(View view){
		finish();
	}

	
	
}
