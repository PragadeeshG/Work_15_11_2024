create table if not exists bu_break_down_handlers_chart(
bu_break_downr_component_definition Integer not null,
bu_break_down_handlers_id Integer null,
bu_break_down_handlers_budget_indicator varchar(255) null,
bu_break_down_handlers_sheet varchar(255) null,
bu_break_down_handlers_control_flag varchar(255) null,
bu_break_down_handlers_desc varchar(255) null,
bu_break_down_handlers_short_desc varchar(255) null,
bu_break_down_handlers_type varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint bu_break_down_handlers_chart_pk primary key(bu_break_downr_component_definition));