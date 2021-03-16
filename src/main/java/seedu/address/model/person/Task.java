package seedu.address.model.person;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import seedu.address.model.tag.Tag;

/**
 * Represents a Person in the address book.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Task {

    // Identity fields
    private final ModuleName moduleName;
    private final ModuleCode moduleCode;
    private final DeadlineDate deadlineDate;
    private final DeadlineTime deadlineTime;
    private final Status status;
    private final Weightage weightage;

    // Data fields
    private final Remark remark;
    private final Set<Tag> tags = new HashSet<>();

    /**
     * Every field must be present and not null.
     */
    public Task(ModuleName moduleName, ModuleCode moduleCode, DeadlineDate deadlineDate,
                DeadlineTime deadlineTime, Status status, Weightage weightage,
                Remark remark, Set<Tag> tags) {
        requireAllNonNull(moduleName, moduleCode, status, tags);
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.weightage = weightage;
        this.deadlineDate = deadlineDate;
        this.deadlineTime = deadlineTime;
        this.status = status;
        this.remark = remark;
        this.tags.addAll(tags);
    }

    public ModuleName getModuleName() {
        return moduleName;
    }

    public ModuleCode getModuleCode() {
        return moduleCode;
    }

    public Weightage getWeightage() {
        return weightage;
    }

    public DeadlineDate getDeadlineDate() {
        return deadlineDate;
    }

    public DeadlineTime getDeadlineTime() {
        return deadlineTime;
    }

    public Status getStatus() {
        return status;
    }

    public Remark getRemark() {
        return remark;
    }

    /**
     * Returns an immutable tag set, which throws {@code UnsupportedOperationException}
     * if modification is attempted.
     */
    public Set<Tag> getTags() {
        return Collections.unmodifiableSet(tags);
    }

    /**
     * Returns true if both persons have the same moduleName.
     * This defines a weaker notion of equality between two persons.
     */
    public boolean isSameTask(Task otherTask) {
        if (otherTask == this) {
            return true;
        }

        return otherTask != null
            && otherTask.getModuleName().equals(getModuleName());
    }

    /**
     * Returns true if both persons have the same identity and data fields.
     * This defines a stronger notion of equality between two persons.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Task)) {
            return false;
        }

        Task otherTask = (Task) other;
        return otherTask.getModuleName().equals(getModuleName())
            && otherTask.getModuleCode().equals(getModuleCode())
            && otherTask.getDeadlineDate().equals(getDeadlineDate())
            && otherTask.getDeadlineTime().equals(getDeadlineTime())
            && otherTask.getStatus().equals(getStatus())
            && otherTask.getWeightage().equals(getWeightage())
            && otherTask.getRemark().equals(getRemark())
            && otherTask.getTags().equals(getTags());
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(moduleName, moduleCode, weightage, remark, tags);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getModuleName())
            .append("; Module Code: ")
            .append(getModuleCode())
            .append("; Deadline Date: ")
            .append(getDeadlineDate())
            .append("; Deadline Time: ")
            .append(getDeadlineTime())
            .append("; Status: ")
            .append(getStatus())
            .append("; Weightage: ")
            .append(getWeightage())
            .append("; Remark: ")
            .append(getRemark());

        Set<Tag> tags = getTags();
        if (!tags.isEmpty()) {
            builder.append("; Tags: ");
            tags.forEach(builder::append);
        }
        return builder.toString();
    }

}
