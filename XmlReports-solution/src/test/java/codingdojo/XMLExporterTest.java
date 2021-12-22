package codingdojo;


import org.approvaltests.Approvals;
import org.approvaltests.core.Options;
import org.approvaltests.scrubbers.RegExScrubber;
import org.junit.jupiter.api.Test;

import java.util.List;

import static codingdojo.SampleModelObjects.*;

public class XMLExporterTest {

    @Test
    public void exportFull() {
        var orders = List.of(RecentOrder, OldOrder);
        String xml = XMLExporter.exportFull(orders);
        Approvals.verifyXml(xml);
    }

    @Test
    public void exportTaxDetails() {
        var orders = List.of(RecentOrder, OldOrder);
        String xml = XMLExporter.exportTaxDetails(orders);
        Approvals.verifyXml(xml);
    }

    @Test
    public void exportStore() {
        Store store = FlagshipStore;
        String xml = XMLExporter.exportStore(store);
        Approvals.verifyXml(xml);
    }

    @Test
    public void exportHistory() {
        var orders = List.of(RecentOrder, OldOrder);
        String xml = XMLExporter.exportHistory(orders);
        Approvals.verifyXml(xml,
                new Options(new RegExScrubber(
                        "createdAt=\"[^\"]+\"",
                        "createdAt=\"2018-09-20T00:00Z\"")
                )
        );
    }

}
