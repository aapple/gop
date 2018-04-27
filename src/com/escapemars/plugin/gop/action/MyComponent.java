package com.escapemars.plugin.gop.action;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.ui.Messages;

/**
 * Created by yaobin on 2018/4/23.
 */
public class MyComponent implements ApplicationComponent {

    public MyComponent() {}

    @Override
    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    @Override
    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @Override
    public String getComponentName() {
        return "MyComponent";
    }

    public void sayHello() {
        // Show dialog with message
        Messages.showMessageDialog(
                "Hello World!",
                "Sample",
                Messages.getInformationIcon()
        );
    }

}
