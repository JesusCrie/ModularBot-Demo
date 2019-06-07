import { ModularBot } from '@modularbot/types-core';

export class MyTSModule {

    public constructor(private LOG: any) {
        LOG.info('Hello from typescript !');
    }

    public onShardsReady(bot: ModularBot): void {
        this.LOG.info('Bot ready ?');
    }
}
