package view;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.view.rich.component.rich.RichPopup;

import view.utils.ADFUtils;

public class InstructorManagedBean {
    private RichPopup popUpDelete;
    public InstructorManagedBean() {
    }

    public String deleteInstructor() {
        // Add event code here...
        DCIteratorBinding itr = ADFUtils.findIterator("InstructorsU1Iterator");
        itr.getCurrentRow().remove();
        ADFUtils.findOperation("Commit").execute();
        getPopUpDelete().hide();
        return null;
    }
    public void setPopUpDelete(RichPopup popUpDelete) {
        this.popUpDelete = popUpDelete;
    }

    public RichPopup getPopUpDelete() {
        return popUpDelete;
    }
}
