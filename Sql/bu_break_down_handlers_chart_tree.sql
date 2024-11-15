create table if not exists bu_break_down_handlers_chart_tree(
bu_break_down_handlers_id Integer not null,
view_tree_effective_date varchar(255) null,
view_tree_code Integer null,
view_tree_description varchar(255) null,
data_library1 varchar(255) null,
data_library1_desc varchar(255) null,
data_library2 varchar(255) null,
data_library2_desc varchar(255) null,
data_library3 varchar(255) null,
data_library3_desc varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint bu_break_down_handlers_chart_tree_pk primary key(bu_break_down_handlers_id));