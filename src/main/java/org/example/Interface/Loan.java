package org.example.Interface;

import java.util.Date;

public interface Loan {
    String getId();
    Date getDueDate();
    boolean isOverdue();
}
