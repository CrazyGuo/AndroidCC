package net.oschina.app.ui;

import net.oschina.app.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTest extends Fragment {

	@Override
	public void onCreate(Bundle saveInstanceBundle)
	{
		super.onCreate(saveInstanceBundle);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup parent,Bundle saveInstanceBundle){
		View view =inflater.inflate(R.layout.fragmenttest, parent,false);
		return view;
	}
}
