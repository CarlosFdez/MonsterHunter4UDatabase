package com.daviancorp.android.ui.list;

import com.daviancorp.android.mh4udatabase.R;
import com.daviancorp.android.ui.general.GenericActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class SkillTreeListActivity extends GenericActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle(R.string.skill_trees);

        // Enable drawer button instead of back button
        super.enableDrawerIndicator();
    }

	@Override
	protected Fragment createFragment() {
		super.detail = new SkillTreeListFragment();
		return super.detail;
	}

}
