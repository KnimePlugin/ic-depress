package org.impressivecode.depress.its.jiraonline.filter;

import org.impressivecode.depress.its.jiraonline.JiraOnlineAdapterUriBuilder.Mode;

public class StatusMapperFilter extends CustomFieldMapperFilter {

    @Override
    protected Mode getURIMode() {
        return Mode.STATE_LIST;
    }

    @Override
    public String getName() {
        return "Status list";
    }

    @Override
    public String getFilterValue() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getFilterModelId() {
        // TODO Auto-generated method stub
        return null;
    }

}
