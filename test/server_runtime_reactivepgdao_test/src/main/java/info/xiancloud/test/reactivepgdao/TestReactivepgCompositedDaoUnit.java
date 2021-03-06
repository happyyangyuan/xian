package info.xiancloud.test.reactivepgdao;

import info.xiancloud.core.Group;
import info.xiancloud.dao.core.action.SqlAction;
import info.xiancloud.dao.core.action.delete.DeleteAction;
import info.xiancloud.dao.core.action.select.SelectAction;
import info.xiancloud.dao.core.action.update.UpdateAction;
import info.xiancloud.dao.core.units.DaoUnit;

public class TestReactivepgCompositedDaoUnit extends DaoUnit {
    @Override
    public SqlAction[] getActions() {
        return new SqlAction[]{
                new UpdateAction() {
                    @Override
                    protected String tableName() {
                        return "untitled_table";
                    }

                    @Override
                    protected String[] searchConditions() {
                        return new String[]{
                                "column2 = '2'"
                        };
                    }
                },
                new DeleteAction() {
                    @Override
                    protected String tableName() {
                        return "untitled_table";
                    }

                    @Override
                    protected String[] searchConditions() {
                        return new String[]{
                                "column3 = 'zz'"
                        };
                    }
                },
                new SelectAction() {
                    @Override
                    protected Object selectList() {
                        return null;
                    }

                    @Override
                    protected Object sourceTable() {
                        return "untitled_table";
                    }

                    @Override
                    protected String[] searchConditions() {
                        return new String[0];
                    }
                }
                ,
        };
    }

    @Override
    public Group getGroup() {
        return ReactivepgTestDaoGroup.SINGLETON;
    }
}
