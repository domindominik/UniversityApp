package main;

import java.util.Date;
import java.util.List;

public class Index
{
    private List <SmallIndex> smallIndices;
    private int semestr;
    private Date startSemestr;
    boolean isPassed;

    public Index(List<SmallIndex> smallIndices, int semestr, Date startSemestr, boolean isPassed)
    {
        this.smallIndices = smallIndices;
        this.semestr = semestr;
        this.startSemestr = startSemestr;
        this.isPassed = isPassed;
    }

    public List<SmallIndex> getSmallIndices()
    {
        return smallIndices;
    }

    public int getSemestr()
    {
        return semestr;
    }

    public Date getStartSemestr()
    {
        return startSemestr;
    }

    public boolean isPassed()
    {
        return isPassed;
    }

    public void setSmallIndices(List<SmallIndex> smallIndices)
    {
        this.smallIndices = smallIndices;
    }

    public void setSemestr(int semestr)
    {
        this.semestr = semestr;
    }

    public void setStartSemestr(Date startSemestr)
    {
        this.startSemestr = startSemestr;
    }

    public void setPassed(boolean passed)
    {
        isPassed = passed;
    }
}

