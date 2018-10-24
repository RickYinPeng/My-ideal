package yp.Mail.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmailAccountsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmailAccountsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andMailUsernameIsNull() {
            addCriterion("Mail_UserName is null");
            return (Criteria) this;
        }

        public Criteria andMailUsernameIsNotNull() {
            addCriterion("Mail_UserName is not null");
            return (Criteria) this;
        }

        public Criteria andMailUsernameEqualTo(String value) {
            addCriterion("Mail_UserName =", value, "mailUsername");
            return (Criteria) this;
        }

        public Criteria andMailUsernameNotEqualTo(String value) {
            addCriterion("Mail_UserName <>", value, "mailUsername");
            return (Criteria) this;
        }

        public Criteria andMailUsernameGreaterThan(String value) {
            addCriterion("Mail_UserName >", value, "mailUsername");
            return (Criteria) this;
        }

        public Criteria andMailUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Mail_UserName >=", value, "mailUsername");
            return (Criteria) this;
        }

        public Criteria andMailUsernameLessThan(String value) {
            addCriterion("Mail_UserName <", value, "mailUsername");
            return (Criteria) this;
        }

        public Criteria andMailUsernameLessThanOrEqualTo(String value) {
            addCriterion("Mail_UserName <=", value, "mailUsername");
            return (Criteria) this;
        }

        public Criteria andMailUsernameLike(String value) {
            addCriterion("Mail_UserName like", value, "mailUsername");
            return (Criteria) this;
        }

        public Criteria andMailUsernameNotLike(String value) {
            addCriterion("Mail_UserName not like", value, "mailUsername");
            return (Criteria) this;
        }

        public Criteria andMailUsernameIn(List<String> values) {
            addCriterion("Mail_UserName in", values, "mailUsername");
            return (Criteria) this;
        }

        public Criteria andMailUsernameNotIn(List<String> values) {
            addCriterion("Mail_UserName not in", values, "mailUsername");
            return (Criteria) this;
        }

        public Criteria andMailUsernameBetween(String value1, String value2) {
            addCriterion("Mail_UserName between", value1, value2, "mailUsername");
            return (Criteria) this;
        }

        public Criteria andMailUsernameNotBetween(String value1, String value2) {
            addCriterion("Mail_UserName not between", value1, value2, "mailUsername");
            return (Criteria) this;
        }

        public Criteria andMailPasswordIsNull() {
            addCriterion("Mail_PassWord is null");
            return (Criteria) this;
        }

        public Criteria andMailPasswordIsNotNull() {
            addCriterion("Mail_PassWord is not null");
            return (Criteria) this;
        }

        public Criteria andMailPasswordEqualTo(String value) {
            addCriterion("Mail_PassWord =", value, "mailPassword");
            return (Criteria) this;
        }

        public Criteria andMailPasswordNotEqualTo(String value) {
            addCriterion("Mail_PassWord <>", value, "mailPassword");
            return (Criteria) this;
        }

        public Criteria andMailPasswordGreaterThan(String value) {
            addCriterion("Mail_PassWord >", value, "mailPassword");
            return (Criteria) this;
        }

        public Criteria andMailPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Mail_PassWord >=", value, "mailPassword");
            return (Criteria) this;
        }

        public Criteria andMailPasswordLessThan(String value) {
            addCriterion("Mail_PassWord <", value, "mailPassword");
            return (Criteria) this;
        }

        public Criteria andMailPasswordLessThanOrEqualTo(String value) {
            addCriterion("Mail_PassWord <=", value, "mailPassword");
            return (Criteria) this;
        }

        public Criteria andMailPasswordLike(String value) {
            addCriterion("Mail_PassWord like", value, "mailPassword");
            return (Criteria) this;
        }

        public Criteria andMailPasswordNotLike(String value) {
            addCriterion("Mail_PassWord not like", value, "mailPassword");
            return (Criteria) this;
        }

        public Criteria andMailPasswordIn(List<String> values) {
            addCriterion("Mail_PassWord in", values, "mailPassword");
            return (Criteria) this;
        }

        public Criteria andMailPasswordNotIn(List<String> values) {
            addCriterion("Mail_PassWord not in", values, "mailPassword");
            return (Criteria) this;
        }

        public Criteria andMailPasswordBetween(String value1, String value2) {
            addCriterion("Mail_PassWord between", value1, value2, "mailPassword");
            return (Criteria) this;
        }

        public Criteria andMailPasswordNotBetween(String value1, String value2) {
            addCriterion("Mail_PassWord not between", value1, value2, "mailPassword");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentIsNull() {
            addCriterion("HasBeen_Sent is null");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentIsNotNull() {
            addCriterion("HasBeen_Sent is not null");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentEqualTo(String value) {
            addCriterion("HasBeen_Sent =", value, "hasbeenSent");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentNotEqualTo(String value) {
            addCriterion("HasBeen_Sent <>", value, "hasbeenSent");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentGreaterThan(String value) {
            addCriterion("HasBeen_Sent >", value, "hasbeenSent");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentGreaterThanOrEqualTo(String value) {
            addCriterion("HasBeen_Sent >=", value, "hasbeenSent");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentLessThan(String value) {
            addCriterion("HasBeen_Sent <", value, "hasbeenSent");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentLessThanOrEqualTo(String value) {
            addCriterion("HasBeen_Sent <=", value, "hasbeenSent");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentLike(String value) {
            addCriterion("HasBeen_Sent like", value, "hasbeenSent");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentNotLike(String value) {
            addCriterion("HasBeen_Sent not like", value, "hasbeenSent");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentIn(List<String> values) {
            addCriterion("HasBeen_Sent in", values, "hasbeenSent");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentNotIn(List<String> values) {
            addCriterion("HasBeen_Sent not in", values, "hasbeenSent");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentBetween(String value1, String value2) {
            addCriterion("HasBeen_Sent between", value1, value2, "hasbeenSent");
            return (Criteria) this;
        }

        public Criteria andHasbeenSentNotBetween(String value1, String value2) {
            addCriterion("HasBeen_Sent not between", value1, value2, "hasbeenSent");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedIsNull() {
            addCriterion("HasBeen_Accepted is null");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedIsNotNull() {
            addCriterion("HasBeen_Accepted is not null");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedEqualTo(String value) {
            addCriterion("HasBeen_Accepted =", value, "hasbeenAccepted");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedNotEqualTo(String value) {
            addCriterion("HasBeen_Accepted <>", value, "hasbeenAccepted");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedGreaterThan(String value) {
            addCriterion("HasBeen_Accepted >", value, "hasbeenAccepted");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedGreaterThanOrEqualTo(String value) {
            addCriterion("HasBeen_Accepted >=", value, "hasbeenAccepted");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedLessThan(String value) {
            addCriterion("HasBeen_Accepted <", value, "hasbeenAccepted");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedLessThanOrEqualTo(String value) {
            addCriterion("HasBeen_Accepted <=", value, "hasbeenAccepted");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedLike(String value) {
            addCriterion("HasBeen_Accepted like", value, "hasbeenAccepted");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedNotLike(String value) {
            addCriterion("HasBeen_Accepted not like", value, "hasbeenAccepted");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedIn(List<String> values) {
            addCriterion("HasBeen_Accepted in", values, "hasbeenAccepted");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedNotIn(List<String> values) {
            addCriterion("HasBeen_Accepted not in", values, "hasbeenAccepted");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedBetween(String value1, String value2) {
            addCriterion("HasBeen_Accepted between", value1, value2, "hasbeenAccepted");
            return (Criteria) this;
        }

        public Criteria andHasbeenAcceptedNotBetween(String value1, String value2) {
            addCriterion("HasBeen_Accepted not between", value1, value2, "hasbeenAccepted");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("LinkMan is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("LinkMan is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("LinkMan =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("LinkMan <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("LinkMan >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("LinkMan >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("LinkMan <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("LinkMan <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("LinkMan like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("LinkMan not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("LinkMan in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("LinkMan not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("LinkMan between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("LinkMan not between", value1, value2, "linkman");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}