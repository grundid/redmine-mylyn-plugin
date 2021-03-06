package net.sf.redmine_mylyn.ui;

import net.sf.redmine_mylyn.core.RedmineCorePlugin;
import net.sf.redmine_mylyn.internal.ui.query.RedmineRepositoryQueryWizard;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.mylyn.tasks.core.IRepositoryQuery;
import org.eclipse.mylyn.tasks.core.ITaskMapping;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.ui.AbstractRepositoryConnectorUi;
import org.eclipse.mylyn.tasks.ui.wizards.ITaskRepositoryPage;
import org.eclipse.mylyn.tasks.ui.wizards.NewTaskWizard;

public class RedmineRepositoryConnectorUi extends AbstractRepositoryConnectorUi {

	@Override
	public String getConnectorKind() {
		return RedmineCorePlugin.REPOSITORY_KIND;
	}

	@Override
	public ITaskRepositoryPage getSettingsPage(TaskRepository repository) {
		return new RedmineRepositorySettingsPage(repository);
	}

	@Override
	public boolean hasSearchPage() {
		// TODO not implemented yet
		return false;
	}

	@Override
	public IWizard getNewTaskWizard(TaskRepository repository, ITaskMapping mapping) {
		return new NewTaskWizard(repository, mapping);
	}

	@Override
	public IWizard getQueryWizard(TaskRepository repository, IRepositoryQuery query) {
		return new RedmineRepositoryQueryWizard(repository, query);
	}

}
