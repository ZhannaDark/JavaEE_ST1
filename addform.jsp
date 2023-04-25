<form action="/add-tasks" method="post">
    <div class="row">
        <div class="col-12">
            <label>NAME : </label>
        </div>
    </div>
    <div class="row mt-2">
        <div class="col-12">
            <input type="text" placeholder="Name..." class="form-control" name="task_name">
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-12">
            <label>DESCRIPTION : </label>
        </div>
    </div>
    <div class="row mt-2">
        <div class="col-12">
            <input type="text" placeholder="Description..." class="form-control" name="task_desc">
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-12">
            <label>DEADLINE_DATE : </label>
        </div>
    </div>
    <div class="row mt-2">
        <div class="col-12">
            <input type="date" placeholder="yy-mm-dd" class="form-control" name="task_dead">
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-12">
            <button class="btn btn-primary">ADD TASK</button>
        </div>
    </div>
</form>