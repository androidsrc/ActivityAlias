package com.androidsrc.activityaliassamle;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView infoText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent intent = getIntent();
		ComponentName cn = intent.getComponent();

		// We can set different content view as well if required based upon
		// ComponentName launched
		setContentView(R.layout.activity_main);

		infoText = (TextView) findViewById(R.id.infoText);

		if (cn.getClassName().contains("AliasActivity")) {
			infoText.setText("Alias Activity CN Launched");
		} else if (cn.getClassName().contains("MainActivity")) {
			infoText.setText("Main Activity CN launched");
		}

	}
}
