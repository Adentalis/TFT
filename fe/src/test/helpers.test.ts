import { getPhasesStats } from '../utility/helper';
import { Word } from '../utility/interfaces';

describe('testing helpers functions', () => {
  test('test getPhaseStats()', () => {
    let words: Word[] = [
      {
        id: 0,
        german: 'string',
        english: 'string',
        example: 'string',
        solution: 'de',
        phase: 0,
        nextGame: '',
      },
      {
        id: 0,
        german: 'string',
        english: 'string',
        example: 'string',
        solution: 'de',
        phase: 3,
        nextGame: '',
      },
      {
        id: 0,
        german: 'string',
        english: 'string',
        example: 'string',
        solution: 'de',
        phase: 2,
        nextGame: '',
      },
      {
        id: 0,
        german: 'string',
        english: 'string',
        example: 'string',
        solution: 'de',
        phase: 2,
        nextGame: '',
      },
      {
        id: 0,
        german: 'string',
        english: 'string',
        example: 'string',
        solution: 'de',
        phase: 0,
        nextGame: '',
      },
    ];
    expect(getPhasesStats(words)).toEqual({
      finished: 0,
      new: 2,
      p1: 0,
      p2: 2,
      p3: 1,
      p4: 0,
      p5: 0,
      p6: 0,
    });
  });
});
