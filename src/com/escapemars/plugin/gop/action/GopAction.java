package com.escapemars.plugin.gop.action;


import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by yaobin on 2018/4/23.
 */
public class GopAction extends AnAction {

    /**
     * 执行插件的入口，相当于java中的main方法
     *
     * @param anActionEvent
     */
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {

//        Application application = ApplicationManager.getApplication();
//        MyComponent myComponent = application.getComponent(MyComponent.class);
//        myComponent.sayHello();

//        Project project = anActionEvent.getData(PlatformDataKeys.PROJECT);
//        Editor editor = anActionEvent.getData(PlatformDataKeys.EDITOR);
//
//        ToolWindow toolWindow = ToolWindowManager.getInstance(project).getToolWindow("test");
//        ConsoleView c onsoleView = TextConsoleBuilderFactory.getInstance().createBuilder(project).getConsole();
//        Content content = toolWindow.getContentManager().getFactory().createContent(consoleView.getComponent(), "A Console Foo Bar", true);
//        toolWindow.getContentManager().addContent(content);

        System.out.print("hello");
    }

}
