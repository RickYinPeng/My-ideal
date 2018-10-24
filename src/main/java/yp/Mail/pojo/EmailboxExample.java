package yp.Mail.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmailboxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmailboxExample() {
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

        public Criteria andEmailidIsNull() {
            addCriterion("EmailID is null");
            return (Criteria) this;
        }

        public Criteria andEmailidIsNotNull() {
            addCriterion("EmailID is not null");
            return (Criteria) this;
        }

        public Criteria andEmailidEqualTo(Integer value) {
            addCriterion("EmailID =", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidNotEqualTo(Integer value) {
            addCriterion("EmailID <>", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidGreaterThan(Integer value) {
            addCriterion("EmailID >", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EmailID >=", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidLessThan(Integer value) {
            addCriterion("EmailID <", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidLessThanOrEqualTo(Integer value) {
            addCriterion("EmailID <=", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidIn(List<Integer> values) {
            addCriterion("EmailID in", values, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidNotIn(List<Integer> values) {
            addCriterion("EmailID not in", values, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidBetween(Integer value1, Integer value2) {
            addCriterion("EmailID between", value1, value2, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidNotBetween(Integer value1, Integer value2) {
            addCriterion("EmailID not between", value1, value2, "emailid");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("Sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("Sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("Sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("Sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("Sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("Sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("Sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("Sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("Sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("Sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("Sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("Sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("Sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("Sender not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSendercodeIsNull() {
            addCriterion("SenderCode is null");
            return (Criteria) this;
        }

        public Criteria andSendercodeIsNotNull() {
            addCriterion("SenderCode is not null");
            return (Criteria) this;
        }

        public Criteria andSendercodeEqualTo(String value) {
            addCriterion("SenderCode =", value, "sendercode");
            return (Criteria) this;
        }

        public Criteria andSendercodeNotEqualTo(String value) {
            addCriterion("SenderCode <>", value, "sendercode");
            return (Criteria) this;
        }

        public Criteria andSendercodeGreaterThan(String value) {
            addCriterion("SenderCode >", value, "sendercode");
            return (Criteria) this;
        }

        public Criteria andSendercodeGreaterThanOrEqualTo(String value) {
            addCriterion("SenderCode >=", value, "sendercode");
            return (Criteria) this;
        }

        public Criteria andSendercodeLessThan(String value) {
            addCriterion("SenderCode <", value, "sendercode");
            return (Criteria) this;
        }

        public Criteria andSendercodeLessThanOrEqualTo(String value) {
            addCriterion("SenderCode <=", value, "sendercode");
            return (Criteria) this;
        }

        public Criteria andSendercodeLike(String value) {
            addCriterion("SenderCode like", value, "sendercode");
            return (Criteria) this;
        }

        public Criteria andSendercodeNotLike(String value) {
            addCriterion("SenderCode not like", value, "sendercode");
            return (Criteria) this;
        }

        public Criteria andSendercodeIn(List<String> values) {
            addCriterion("SenderCode in", values, "sendercode");
            return (Criteria) this;
        }

        public Criteria andSendercodeNotIn(List<String> values) {
            addCriterion("SenderCode not in", values, "sendercode");
            return (Criteria) this;
        }

        public Criteria andSendercodeBetween(String value1, String value2) {
            addCriterion("SenderCode between", value1, value2, "sendercode");
            return (Criteria) this;
        }

        public Criteria andSendercodeNotBetween(String value1, String value2) {
            addCriterion("SenderCode not between", value1, value2, "sendercode");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("Receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("Receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("Receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("Receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("Receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("Receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("Receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("Receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("Receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("Receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("Receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("Receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("Receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("Receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceivercodeIsNull() {
            addCriterion("ReceiverCode is null");
            return (Criteria) this;
        }

        public Criteria andReceivercodeIsNotNull() {
            addCriterion("ReceiverCode is not null");
            return (Criteria) this;
        }

        public Criteria andReceivercodeEqualTo(String value) {
            addCriterion("ReceiverCode =", value, "receivercode");
            return (Criteria) this;
        }

        public Criteria andReceivercodeNotEqualTo(String value) {
            addCriterion("ReceiverCode <>", value, "receivercode");
            return (Criteria) this;
        }

        public Criteria andReceivercodeGreaterThan(String value) {
            addCriterion("ReceiverCode >", value, "receivercode");
            return (Criteria) this;
        }

        public Criteria andReceivercodeGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiverCode >=", value, "receivercode");
            return (Criteria) this;
        }

        public Criteria andReceivercodeLessThan(String value) {
            addCriterion("ReceiverCode <", value, "receivercode");
            return (Criteria) this;
        }

        public Criteria andReceivercodeLessThanOrEqualTo(String value) {
            addCriterion("ReceiverCode <=", value, "receivercode");
            return (Criteria) this;
        }

        public Criteria andReceivercodeLike(String value) {
            addCriterion("ReceiverCode like", value, "receivercode");
            return (Criteria) this;
        }

        public Criteria andReceivercodeNotLike(String value) {
            addCriterion("ReceiverCode not like", value, "receivercode");
            return (Criteria) this;
        }

        public Criteria andReceivercodeIn(List<String> values) {
            addCriterion("ReceiverCode in", values, "receivercode");
            return (Criteria) this;
        }

        public Criteria andReceivercodeNotIn(List<String> values) {
            addCriterion("ReceiverCode not in", values, "receivercode");
            return (Criteria) this;
        }

        public Criteria andReceivercodeBetween(String value1, String value2) {
            addCriterion("ReceiverCode between", value1, value2, "receivercode");
            return (Criteria) this;
        }

        public Criteria andReceivercodeNotBetween(String value1, String value2) {
            addCriterion("ReceiverCode not between", value1, value2, "receivercode");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("Content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("Content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("Content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("Content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("Content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("Content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("Content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("Content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("Content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("Content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("Content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("Content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("Content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("Content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNull() {
            addCriterion("Enclosure is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNotNull() {
            addCriterion("Enclosure is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureEqualTo(String value) {
            addCriterion("Enclosure =", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotEqualTo(String value) {
            addCriterion("Enclosure <>", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThan(String value) {
            addCriterion("Enclosure >", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThanOrEqualTo(String value) {
            addCriterion("Enclosure >=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThan(String value) {
            addCriterion("Enclosure <", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThanOrEqualTo(String value) {
            addCriterion("Enclosure <=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLike(String value) {
            addCriterion("Enclosure like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotLike(String value) {
            addCriterion("Enclosure not like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureIn(List<String> values) {
            addCriterion("Enclosure in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotIn(List<String> values) {
            addCriterion("Enclosure not in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureBetween(String value1, String value2) {
            addCriterion("Enclosure between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotBetween(String value1, String value2) {
            addCriterion("Enclosure not between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andSendtypeIsNull() {
            addCriterion("SendType is null");
            return (Criteria) this;
        }

        public Criteria andSendtypeIsNotNull() {
            addCriterion("SendType is not null");
            return (Criteria) this;
        }

        public Criteria andSendtypeEqualTo(Integer value) {
            addCriterion("SendType =", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotEqualTo(Integer value) {
            addCriterion("SendType <>", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeGreaterThan(Integer value) {
            addCriterion("SendType >", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SendType >=", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeLessThan(Integer value) {
            addCriterion("SendType <", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeLessThanOrEqualTo(Integer value) {
            addCriterion("SendType <=", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeIn(List<Integer> values) {
            addCriterion("SendType in", values, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotIn(List<Integer> values) {
            addCriterion("SendType not in", values, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeBetween(Integer value1, Integer value2) {
            addCriterion("SendType between", value1, value2, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SendType not between", value1, value2, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSenddateIsNull() {
            addCriterion("SendDate is null");
            return (Criteria) this;
        }

        public Criteria andSenddateIsNotNull() {
            addCriterion("SendDate is not null");
            return (Criteria) this;
        }

        public Criteria andSenddateEqualTo(Date value) {
            addCriterion("SendDate =", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateNotEqualTo(Date value) {
            addCriterion("SendDate <>", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateGreaterThan(Date value) {
            addCriterion("SendDate >", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("SendDate >=", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateLessThan(Date value) {
            addCriterion("SendDate <", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateLessThanOrEqualTo(Date value) {
            addCriterion("SendDate <=", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateIn(List<Date> values) {
            addCriterion("SendDate in", values, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateNotIn(List<Date> values) {
            addCriterion("SendDate not in", values, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateBetween(Date value1, Date value2) {
            addCriterion("SendDate between", value1, value2, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateNotBetween(Date value1, Date value2) {
            addCriterion("SendDate not between", value1, value2, "senddate");
            return (Criteria) this;
        }

        public Criteria andReaddateIsNull() {
            addCriterion("ReadDate is null");
            return (Criteria) this;
        }

        public Criteria andReaddateIsNotNull() {
            addCriterion("ReadDate is not null");
            return (Criteria) this;
        }

        public Criteria andReaddateEqualTo(Date value) {
            addCriterion("ReadDate =", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateNotEqualTo(Date value) {
            addCriterion("ReadDate <>", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateGreaterThan(Date value) {
            addCriterion("ReadDate >", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ReadDate >=", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateLessThan(Date value) {
            addCriterion("ReadDate <", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateLessThanOrEqualTo(Date value) {
            addCriterion("ReadDate <=", value, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateIn(List<Date> values) {
            addCriterion("ReadDate in", values, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateNotIn(List<Date> values) {
            addCriterion("ReadDate not in", values, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateBetween(Date value1, Date value2) {
            addCriterion("ReadDate between", value1, value2, "readdate");
            return (Criteria) this;
        }

        public Criteria andReaddateNotBetween(Date value1, Date value2) {
            addCriterion("ReadDate not between", value1, value2, "readdate");
            return (Criteria) this;
        }

        public Criteria andBoxtypeIsNull() {
            addCriterion("BoxType is null");
            return (Criteria) this;
        }

        public Criteria andBoxtypeIsNotNull() {
            addCriterion("BoxType is not null");
            return (Criteria) this;
        }

        public Criteria andBoxtypeEqualTo(Integer value) {
            addCriterion("BoxType =", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeNotEqualTo(Integer value) {
            addCriterion("BoxType <>", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeGreaterThan(Integer value) {
            addCriterion("BoxType >", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BoxType >=", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeLessThan(Integer value) {
            addCriterion("BoxType <", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeLessThanOrEqualTo(Integer value) {
            addCriterion("BoxType <=", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeIn(List<Integer> values) {
            addCriterion("BoxType in", values, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeNotIn(List<Integer> values) {
            addCriterion("BoxType not in", values, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeBetween(Integer value1, Integer value2) {
            addCriterion("BoxType between", value1, value2, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BoxType not between", value1, value2, "boxtype");
            return (Criteria) this;
        }

        public Criteria andEmailstatusIsNull() {
            addCriterion("EmailStatus is null");
            return (Criteria) this;
        }

        public Criteria andEmailstatusIsNotNull() {
            addCriterion("EmailStatus is not null");
            return (Criteria) this;
        }

        public Criteria andEmailstatusEqualTo(Integer value) {
            addCriterion("EmailStatus =", value, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusNotEqualTo(Integer value) {
            addCriterion("EmailStatus <>", value, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusGreaterThan(Integer value) {
            addCriterion("EmailStatus >", value, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("EmailStatus >=", value, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusLessThan(Integer value) {
            addCriterion("EmailStatus <", value, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusLessThanOrEqualTo(Integer value) {
            addCriterion("EmailStatus <=", value, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusIn(List<Integer> values) {
            addCriterion("EmailStatus in", values, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusNotIn(List<Integer> values) {
            addCriterion("EmailStatus not in", values, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusBetween(Integer value1, Integer value2) {
            addCriterion("EmailStatus between", value1, value2, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("EmailStatus not between", value1, value2, "emailstatus");
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