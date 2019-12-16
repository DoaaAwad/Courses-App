package view;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.OperationBinding;

import view.utils.ADFUtils;
import view.utils.JSFUtils;

public class CourseSearchClass {
    private RichPopup popUpDelete;

    public CourseSearchClass() {
    }

   // public String deleteCourse() {
        // Add event code here...
        
   // }

    public void setPopUpDelete(RichPopup popUpDelete) {
        this.popUpDelete = popUpDelete;
    }

    public RichPopup getPopUpDelete() {
        return popUpDelete;
    }

    public void deleteCourse(DialogEvent dialogEvent) {
        // Add event code here...
    /*    DCIteratorBinding itr = ADFUtils.findIterator("CoursesU1Iterator");
        itr.getCurrentRow().remove();
        ADFUtils.findOperation("Commit").execute();
        getPopUpDelete().hide();
        //return null; */
        if(dialogEvent.getOutcome().equals(DialogEvent.Outcome.ok)){
            OperationBinding deleteOptr =ADFUtils.findOperation("Delete");
                deleteOptr.execute();
                OperationBinding commitOptr =ADFUtils.findOperation("Commit");
                    commitOptr.execute();  
                    JSFUtils.addFacesInformationMessage("The course has been deleted");
            }
    }
}
