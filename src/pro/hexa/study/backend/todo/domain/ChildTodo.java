package pro.hexa.study.backend.todo.domain;

import java.time.LocalDateTime;

public class ChildTodo extends Todo {

    private ParentTodo parent;

    public ChildTodo(String title, String detail, Short timeToTakeInMinutes, LocalDateTime startAt, boolean completeYn, ParentTodo parent) {
        super(title, detail, timeToTakeInMinutes, startAt, completeYn);
        this.setParentTodo(parent);
    }

    public ParentTodo getParent() {
        return this.parent;
    }
    public void rmParent(){
        this.parent = null;
    }

    public void setParentTodo(ParentTodo parent) {
        this.parent = parent;
        // todo: parentTodo를 지정하고, parentTodo의 details에 이 childTodo가 없으면 details에도 추가.
    }

    void completeTodo() {
        this.completeYn = true;
        // todo: 이 childTodo의 완료 처리
    }

}
